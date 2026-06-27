package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data101RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data102RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data103RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data104RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data105RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data106RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data107RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data108RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data109RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data110RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen011ViewModel @Inject constructor(
    private val repo1: Data101RepositoryImpl,
    private val repo2: Data102RepositoryImpl,
    private val repo3: Data103RepositoryImpl,
    private val repo4: Data104RepositoryImpl,
    private val repo5: Data105RepositoryImpl,
    private val repo6: Data106RepositoryImpl,
    private val repo7: Data107RepositoryImpl,
    private val repo8: Data108RepositoryImpl,
    private val repo9: Data109RepositoryImpl,
    private val repo10: Data110RepositoryImpl,

): ViewModel() {
}
