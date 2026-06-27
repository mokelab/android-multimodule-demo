package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data111RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data112RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data113RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data114RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data115RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data116RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data117RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data118RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data119RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data120RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen012ViewModel @Inject constructor(
    private val repo1: Data111RepositoryImpl,
    private val repo2: Data112RepositoryImpl,
    private val repo3: Data113RepositoryImpl,
    private val repo4: Data114RepositoryImpl,
    private val repo5: Data115RepositoryImpl,
    private val repo6: Data116RepositoryImpl,
    private val repo7: Data117RepositoryImpl,
    private val repo8: Data118RepositoryImpl,
    private val repo9: Data119RepositoryImpl,
    private val repo10: Data120RepositoryImpl,

): ViewModel() {
}
