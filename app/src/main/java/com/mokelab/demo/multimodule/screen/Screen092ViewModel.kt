package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data911RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data912RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data913RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data914RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data915RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data916RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data917RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data918RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data919RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data920RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen092ViewModel @Inject constructor(
    private val repo1: Data911RepositoryImpl,
    private val repo2: Data912RepositoryImpl,
    private val repo3: Data913RepositoryImpl,
    private val repo4: Data914RepositoryImpl,
    private val repo5: Data915RepositoryImpl,
    private val repo6: Data916RepositoryImpl,
    private val repo7: Data917RepositoryImpl,
    private val repo8: Data918RepositoryImpl,
    private val repo9: Data919RepositoryImpl,
    private val repo10: Data920RepositoryImpl,

): ViewModel() {
}
